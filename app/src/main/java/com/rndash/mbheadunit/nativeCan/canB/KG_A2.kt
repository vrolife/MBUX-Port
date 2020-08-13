package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame KG_A2 (ID: 0x0050)
**/
object KG_A2 {

	/** rear window open / close right **/
	fun get_fhr_kg() : Boolean = getParam(0, 1) != 0

	/** Open windows, rear left / Close **/
	fun get_fhl_kg() : Boolean = getParam(1, 1) != 0

	/** Front windows open / close right **/
	fun get_fvr_kg() : Boolean = getParam(2, 1) != 0

	/** Open windows front left / Close **/
	fun get_fvl_kg() : Boolean = getParam(3, 1) != 0

	/** Open / close SHD / top **/
	fun get_shd_kg() : Boolean = getParam(4, 1) != 0

	/** Direction touch control **/
	fun get_kb_ri_kg() : Boolean = getParam(5, 1) != 0

	/** Mode-touch control **/
	fun get_kb_mod_kg() : Boolean = getParam(6, 1) != 0

	override fun toString(): String {
		return """
			FHR_KG: ${get_fhr_kg()}
			FHL_KG: ${get_fhl_kg()}
			FVR_KG: ${get_fvr_kg()}
			FVL_KG: ${get_fvl_kg()}
			SHD_KG: ${get_shd_kg()}
			KB_RI_KG: ${get_kb_ri_kg()}
			KB_MOD_KG: ${get_kb_mod_kg()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, o, l)
}
