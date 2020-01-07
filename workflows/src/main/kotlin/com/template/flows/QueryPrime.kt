package com.template.flows

import co.paralleluniverse.fibers.Suspendable
import net.corda.core.flows.FlowLogic
import net.corda.core.flows.InitiatingFlow
import net.corda.core.identity.Party
import net.corda.core.utilities.unwrap
import net.corda.core.flows.*
import net.corda.core.utilities.ProgressTracker
import net.corda.core.contracts.Command
import net.corda.core.transactions.TransactionBuilder
import com.template.states.BondState
import com.template.contracts.TemplateContract

// Simple flow that requests the Nth prime number from the specified oracle.
@InitiatingFlow
@StartableByRPC
class QueryPrime(val oracle: Party, val n: Int) : FlowLogic<Int>() {
    @Suspendable override fun call() = initiateFlow(oracle).sendAndReceive<Int>(n).unwrap { it }
}