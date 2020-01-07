package com.template.contracts

import net.corda.core.contracts.*
import net.corda.core.identity.AbstractParty
import net.corda.core.transactions.LedgerTransaction

//  const val PRIME_PROGRAM_ID: ContractClassName = "net.corda.examples.oracle.base.contract.PrimeContract"

class DiscountFactorContract : Contract {
    // Commands signed by oracles must contain the facts the oracle is attesting to.
    class Create(val isoDate: String, val discountFactor: Double) : CommandData

    // Our contract does not check that the Nth prime is correct. Instead, it checks that the
    // information in the command and state match.
    override fun verify(tx: LedgerTransaction) = requireThat {
        "There are no inputs" using (tx.inputs.isEmpty())
        val output = tx.outputsOfType<DiscountFactorState>().single()
        val command = tx.commands.requireSingleCommand<Create>().value
        "The Discount Factor in the output does not match the Discount Factor in the command." using
                (command.isoDate == output.isoDate && command.discountFactor == output.discountFactor)
    }
}

// `Requester` is the Party that will store this fact in its vault.
@BelongsToContract(DiscountFactorContract::class)
data class DiscountFactorState(val isoDate: String,
                      val discountFactor: Double,
                      val requester: AbstractParty) : ContractState {
    override val participants: List<AbstractParty> get() = listOf(requester)
    override fun toString() = "The Discount Factor associated with the date ${isoDate} is $discountFactor."
}