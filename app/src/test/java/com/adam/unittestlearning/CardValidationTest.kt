package com.adam.unittestlearning

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class CardValidationTest {

    var cardValidation: CardValidation? = null

    @Before
    fun setUp() {
        //this will be used to run before every test function
        cardValidation = CardValidation()
    }

    @After
    fun tearDown() {
        //this will be used to run after every test function
        cardValidation = null
    }

    @Test
    fun getCardInput() {
        assert(cardValidation!!.cardInput == "1111-1222-1112-1216")
        assertTrue(cardValidation!!.cardInput == "1111-1222-1112-1216")
        assertFalse(cardValidation!!.cardInput != "1111-1222-1112-1216")
    }

    @Test
    fun getDateInput() {
        assert(cardValidation!!.dateInput == "12/16")
        assertTrue(cardValidation!!.dateInput == "12/16")
        assertFalse(cardValidation!!.dateInput != "12/16")
    }
    /// Business Logic ///

    @Test
//    fun bankMatchesCardInitialSuccess() {
    fun `match the card initials to check for bank - success`() {
        val alfaBank: String = "1111-1222-1112-1216"

        val validBank: Boolean = cardValidation!!.verifyBank(alfaBank)

        assertTrue(validBank)
    }

    @Test
    fun `match the card initials to check for bank - failure`() {
        val alfaBank: String = "1234-1222-1112-1216"

        val validBank: Boolean = cardValidation!!.verifyBank(alfaBank)

        assertFalse(validBank)
    }



}