package sample.logic.counter

import teak.framework.core.TeakComponentContract
import teak.framework.core.utils.pair

class Update : TeakComponentContract.Updater<Contract.Model, Contract.Msg> {
    override fun update(
        model: Contract.Model,
        message: Contract.Msg
    ): Pair<Contract.Model, List<() -> Contract.Msg>> {
        return when (message) {
            Contract.Msg.Dec -> pair(model.copy(value = model.value - 1))
            Contract.Msg.Inc -> pair(model.copy(value = model.value + 1))
        }
    }
}