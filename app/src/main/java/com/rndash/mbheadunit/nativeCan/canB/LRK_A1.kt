package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame LRK_A1 (ID: 0x0288)
**/
object LRK_A1 {

	/** Switch LED steering wheel heating **/
	fun get_lhzg_led_ein() : Boolean = getParam(1, 1) != 0

	/** LEDs blink LRK wg. disorder **/
	fun get_lrk_stoerg() : Boolean = getParam(2, 1) != 0

	override fun toString(): String {
		return """
			LHZG_LED_EIN: ${get_lhzg_led_ein()}
			LRK_STOERG: ${get_lrk_stoerg()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.LRK_A1, o, l)
}
