package com.nsperkins.lib

import org.apache.commons.lang3.StringUtils

class Thingy {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            Thingy().printCapitalized("hello friend")
        }
    }
    fun printCapitalized(str: String) {
        println(StringUtils.capitalize(str));
    }
}
