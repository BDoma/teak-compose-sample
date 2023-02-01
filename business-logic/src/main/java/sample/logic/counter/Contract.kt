package sample.logic.counter

interface Contract {
    sealed class Msg {
        object Inc : Msg()
        object Dec : Msg()
    }

    data class Model(
        val value: Int
    )
}