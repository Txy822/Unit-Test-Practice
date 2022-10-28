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

    val integerChars = '0'..'9'


   // /^[a-zA-Z0-9._-]+$/
   // "^4[0-9]{12}(?:[0-9]{3})?$"
   // regex = "^4[0-9]{12}(?:[0-9]{3})?$";

    fun validateCardDetails(
        cardInput: String,
        dateInput: String
    ): Boolean {
        if ((cardInput.length != 19) || (dateInput.length != 4) ||(!checkIsCardNumberIsDigitAndHyphen()) ||(!verifyBank(cardInput))) {
            return false
        }


     return true
    }
    fun checkIsCardNumberIsDigitAndHyphen(): Boolean{
      return  cardInput.all { it in integerChars || it == '-' }
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