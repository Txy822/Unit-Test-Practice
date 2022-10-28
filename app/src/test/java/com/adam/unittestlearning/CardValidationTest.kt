package com.adam.unittestlearning

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class CardValidationTest {

    var cardValidation: CardValidation? = null

    private lateinit var sampleValidCard:String
    private lateinit var sampleInValidCard:String

    private lateinit var sampleValidDate:String
    private lateinit var sampleInValidDate:String

    @Before
    fun setUp() {
        //this will be used to run before every test function
        cardValidation = CardValidation()
        sampleValidCard ="1111-1222-1112-1216"
        sampleInValidCard ="111341-1222-1112-12816"

        sampleValidDate ="1216"
        sampleInValidDate ="128816"
    }

    @After
    fun tearDown() {
        //this will be used to run after every test function
        cardValidation = null
        sampleValidCard=""
        sampleInValidCard=""
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

    @Test
    fun `right card detail-success`(){
       // assertTrue(cardValidation!!.getCardInputLength()==sampleInValidCard.length)
        //assertTrue(cardValidation!!.getDateInputLength()==sampleValidDate.length)
        assertTrue(cardValidation!!.validateCardDetails(sampleValidCard,sampleValidDate))
    }

    @Test
    fun `invalid card detail-success`(){
        assertFalse(cardValidation!!.validateCardDetails(sampleInValidCard,sampleInValidDate))
    }

    @Test
    fun `card length too long-failure`(){


    }

    @Test
    fun `date input length too long-failure`(){
    }


}