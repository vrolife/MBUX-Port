package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame TVR_A2 (ID: 0x0045)
**/
object TVR_A2 {

	/** rear window open / close right **/
	fun get_fhr_tvr() : Boolean = getParam(8, 1) != 0

	/** Open windows, rear left / Close **/
	fun get_fhl_tvr() : Boolean = getParam(9, 1) != 0

	/** Front windows open / close right **/
	fun get_fvr_tvr() : Boolean = getParam(10, 1) != 0

	/** Open windows front left / Close **/
	fun get_fvl_tvr() : Boolean = getParam(11, 1) != 0

	/** Open / close SHD / top **/
	fun get_shd_tvr() : Boolean = getParam(12, 1) != 0

	/** Direction touch control **/
	fun get_kb_ri_tvr() : Boolean = getParam(13, 1) != 0

	/** Mode-touch control **/
	fun get_kb_mod_tvr() : Boolean = getParam(14, 1) != 0

	/** automatically close **/
	fun get_fhr_as_rl() : Boolean = getParam(16, 1) != 0

	/** manually close **/
	fun get_fhr_ms_rl() : Boolean = getParam(17, 1) != 0

	/** manually open **/
	fun get_fhr_moe_rl() : Boolean = getParam(18, 1) != 0

	/** Automatically open **/
	fun get_fhr_aoe_rl() : Boolean = getParam(19, 1) != 0

	/** Left rear windows **/
	fun get_fhl_as_rl() : Boolean = getParam(20, 1) != 0

	/** rear left window **/
	fun get_fhl_ms_rl() : Boolean = getParam(21, 1) != 0

	/** Left rear window **/
	fun get_fhl_moe_rl() : Boolean = getParam(22, 1) != 0

	/** Left rear windows **/
	fun get_fhl_aoe_rl() : Boolean = getParam(23, 1) != 0

	/** the left window front **/
	fun get_fvl_as() : Boolean = getParam(28, 1) != 0

	/** the left window front **/
	fun get_fvl_ms() : Boolean = getParam(29, 1) != 0

	/** the left window front **/
	fun get_fvl_moe() : Boolean = getParam(30, 1) != 0

	/** the left window front **/
	fun get_fvl_aoe() : Boolean = getParam(31, 1) != 0

	override fun toString(): String {
		return """
			FHR_TVR: ${get_fhr_tvr()}
			FHL_TVR: ${get_fhl_tvr()}
			FVR_TVR: ${get_fvr_tvr()}
			FVL_TVR: ${get_fvl_tvr()}
			SHD_TVR: ${get_shd_tvr()}
			KB_RI_TVR: ${get_kb_ri_tvr()}
			KB_MOD_TVR: ${get_kb_mod_tvr()}
			FHR_AS_RL: ${get_fhr_as_rl()}
			FHR_MS_RL: ${get_fhr_ms_rl()}
			FHR_MOE_RL: ${get_fhr_moe_rl()}
			FHR_AOE_RL: ${get_fhr_aoe_rl()}
			FHL_AS_RL: ${get_fhl_as_rl()}
			FHL_MS_RL: ${get_fhl_ms_rl()}
			FHL_MOE_RL: ${get_fhl_moe_rl()}
			FHL_AOE_RL: ${get_fhl_aoe_rl()}
			FVL_AS: ${get_fvl_as()}
			FVL_MS: ${get_fvl_ms()}
			FVL_MOE: ${get_fvl_moe()}
			FVL_AOE: ${get_fvl_aoe()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.TVR_A2, o, l)
}
