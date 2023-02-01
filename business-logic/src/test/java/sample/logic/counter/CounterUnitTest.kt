package sample.logic.counter

import org.junit.Assert
import org.junit.Test

class CounterUnitTest {
    @Test
    fun incTest() {
        val updater = Update()
        val model = Contract.Model(0)
        val result = updater.update(model, Contract.Msg.Inc)
        val resultModel = result.first

        Assert.assertEquals(resultModel.value, 1)
    }

    @Test
    fun decTest() {
        val updater = Update()
        val model = Contract.Model(0)
        val result = updater.update(model, Contract.Msg.Dec)
        val resultModel = result.first

        Assert.assertEquals(resultModel.value, -1)
    }
}