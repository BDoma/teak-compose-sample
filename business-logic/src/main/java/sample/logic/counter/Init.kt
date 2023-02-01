package sample.logic.counter

import teak.framework.core.TeakComponentContract

class Init : TeakComponentContract.Initializer<Contract.Model, Contract.Msg> {
    override fun init(): Pair<Contract.Model, List<() -> Contract.Msg>> = Pair(Contract.Model(0), emptyList())
}

