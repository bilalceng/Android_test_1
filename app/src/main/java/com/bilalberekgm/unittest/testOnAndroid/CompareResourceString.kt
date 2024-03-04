package com.bilalberekgm.unittest.testOnAndroid

import android.content.Context

class CompareResourceString() {
    fun controlResourceWordIsEqual(context: Context, resId: Int, word:String): Boolean{
        return context.getString(resId) == word
    }
}