package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame KLA_A2 (ID: 0x0250)
**/
object KLA_A2 {

	/** rear window open / close right **/
	fun get_fhr_kla() : Boolean = getParam(0, 1) != 0

	/** Open windows, rear left / Close **/
	fun get_fhl_kla() : Boolean = getParam(1, 1) != 0

	/** Front windows open / close right **/
	fun get_fvr_kla() : Boolean = getParam(2, 1) != 0

	/** Open windows front left / Close **/
	fun get_fvl_kla() : Boolean = getParam(3, 1) != 0

	/** Open / close SHD / top **/
	fun get_shd_kla() : Boolean = getParam(4, 1) != 0

	/** Direction touch control **/
	fun get_kb_ri_kla() : Boolean = getParam(5, 1) != 0

	/** Mode-touch control **/
	fun get_kb_mod_kla() : Boolean = getParam(6, 1) != 0

	override fun toString(): String {
		return """
			FHR_KLA: ${get_fhr_kla()}
			FHL_KLA: ${get_fhl_kla()}
			FVR_KLA: ${get_fvr_kla()}
			FVL_KLA: ${get_fvl_kla()}
			SHD_KLA: ${get_shd_kla()}
			KB_RI_KLA: ${get_kb_ri_kla()}
			KB_MOD_KLA: ${get_kb_mod_kla()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A2, o, l)
}
