package sample.logic.counter

import teak.framework.core.utils.pair

fun counterUpdate(
    model: Contract.Model,
    message: Contract.Msg
): Pair<Contract.Model, List<() -> Contract.Msg>> {
    return when (message) {
        Contract.Msg.Dec -> pair(model.copy(value = model.value - 1))
        Contract.Msg.Inc -> pair(model.copy(value = model.value + 1))
    }
}
