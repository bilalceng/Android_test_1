package com.bilalberekgm.unittest

object RegistrationObject {

    var userList:MutableList<String> = mutableListOf("Carl","John", "Murat", "Mustafa")

     fun controlUserInfo(
        userName:String,
        password: String,
        repeatPassword: String
    ):Boolean{


         if (userName.isEmpty()){
             return false
         }
         else if (userList.contains(userName)){
             return false
         }
         else if(password.isEmpty()){
             return false
         }
         else if (password.count{it.isDigit()} < 2){
             return false
         }
         else if (!password.equals(repeatPassword)){
             return false
         }
         else{
             return true
         }
     }

}

