package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame THR_A1 (ID: 0x009C)
**/
object THR_A1 {

	/** Windows normalized rear right **/
	fun get_fhr_norm() : Boolean = getParam(0, 1) != 0

	/** Rear windows blocked right **/
	fun get_fhr_block() : Boolean = getParam(1, 1) != 0

	/** Window open rear right **/
	fun get_fhr_auf() : Boolean = getParam(2, 1) != 0

	/** Windows, rear right larger short-stroke **/
	fun get_fhr_kzhb() : Boolean = getParam(3, 1) != 0

	/** (1/Ankerumdre) (1 / Ankerumdre) Window position rear right **/
	fun get_feste_hr() : Int = getParam(4, 12)

	override fun toString(): String {
		return """
			FHR_NORM: ${get_fhr_norm()}
			FHR_BLOCK: ${get_fhr_block()}
			FHR_AUF: ${get_fhr_auf()}
			FHR_KZHB: ${get_fhr_kzhb()}
			FESTE_HR: ${get_feste_hr()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.THR_A1, o, l)
}
