package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame THL_A1 (ID: 0x009A)
**/
object THL_A1 {

	/** normalized power windows, rear left **/
	fun get_fhl_norm() : Boolean = getParam(0, 1) != 0

	/** Rear windows blocked the left **/
	fun get_fhl_block() : Boolean = getParam(1, 1) != 0

	/** open window, rear left **/
	fun get_fhl_auf() : Boolean = getParam(2, 1) != 0

	/** Windows rear left short-stroke greater **/
	fun get_fhl_kzhb() : Boolean = getParam(3, 1) != 0

	/** (1/Ankerumdre) (1 / Ankerumdre) window position rear left **/
	fun get_feste_hl() : Int = getParam(4, 12)

	override fun toString(): String {
		return """
			FHL_NORM: ${get_fhl_norm()}
			FHL_BLOCK: ${get_fhl_block()}
			FHL_AUF: ${get_fhl_auf()}
			FHL_KZHB: ${get_fhl_kzhb()}
			FESTE_HL: ${get_feste_hl()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.THL_A1, o, l)
}
