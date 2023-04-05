package sample.logic.counter

fun counterInit(): Pair<Contract.Model, List<() -> Contract.Msg>> = Pair(Contract.Model(0), emptyList())


