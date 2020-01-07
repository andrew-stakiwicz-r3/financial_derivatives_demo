package com.template.states

import com.template.contracts.TemplateContract
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.ContractState
import net.corda.core.identity.AbstractParty
import net.corda.core.identity.Party
import java.util.Date

@BelongsToContract(TemplateContract::class)
data class BondState(val notional: Int,
               val coupon: Double, 
               val startDate: Date,  
               val maturity: String, 
               val lender: Party,
               val borrower: Party) : ContractState {
    override val participants get() = listOf(lender, borrower)
}