package com.adam.unittestlearning

class CardValidation {

    // User INPUT  CORRECT//
    val cardInput = "1111-1222-1112-1216"
    val dateInput = "12/16"
    // User INPUT  CORRECT//

    // User INPUT  FALSE//

    //input has 19 char
    val randomCardInput = "3242-1222-1112-1216"
    val randomDateInput = "04/34"

    fun validateCardDetails(
        cardInput: String,
        dateInput: String
    ): Boolean {

        if((cardInput.length !=19)||(dateInput.length !=4) ||!verifyBank(cardInput)){
            return  false
        }
       else {
            return false
        }
    }

    /*
    Gets the length of valid input for card input
     */
    fun getCardInputLength():Int {
        return cardInput.length
    }

    /*
 Gets the length of valid input for date
  */
    fun getDateInputLength():Int {
        return dateInput.length
    }


    fun verifyBank(cardInput: String) = when (cardInput.take(4)) {
        ACME -> true
        ALFA -> true
        AMEX -> true
        else -> false
    }

    companion object {
        const val ACME = "1121"
        const val ALFA = "1111"
        const val AMEX = "3796"
    }

}