package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame NM_WSS (ID: 0x0426)
**/
object NM_WSS {

	/** Netzwerkmanagement **/
	fun get_nm() : Int = getParam(0, 64)

	override fun toString(): String {
		return """
			NM: ${get_nm()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.NM_WSS, o, l)
}
