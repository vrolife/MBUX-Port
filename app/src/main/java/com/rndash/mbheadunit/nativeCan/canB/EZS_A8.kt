package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame EZS_A8 (ID: 0x0390)
**/
object EZS_A8 {

	/** not installed auxiliary water pump **/
	fun get_zwp_nvh() : Boolean = getParam(0, 1) != 0

	/** manual air recirculation circuit indefinite period of time **/
	fun get_umluft_ubg() : Boolean = getParam(1, 1) != 0

	/** always REHEAT-operation **/
	fun get_rht_ein() : Boolean = getParam(2, 1) != 0

	/** Blower bar display only in the manual mode **/
	fun get_gba_man() : Boolean = getParam(3, 1) != 0

	/** 40% basic ventilation **/
	fun get_gbl_40() : Boolean = getParam(4, 1) != 0

	/** Noxious gas-dependent air recirculation generally a **/
	fun get_sus_ein() : Boolean = getParam(5, 1) != 0

	/** Noxious gas-dependent air recirculation from **/
	fun get_sus_aus() : Boolean = getParam(6, 1) != 0

	/** Refrigerant level control inactive **/
	fun get_kfk_aus() : Boolean = getParam(7, 1) != 0

	/** "+ 1 ° C" increase **/
	fun get_kaltland_1() : Boolean = getParam(8, 1) != 0

	/** "- 2 ° C" Reduced **/
	fun get_heissland_2() : Boolean = getParam(9, 1) != 0

	/** "+ 2 ° C" increase **/
	fun get_kaltland_2() : Boolean = getParam(10, 1) != 0

	/** close air recirculation flap from <20% throughout **/
	fun get_umluft_ein() : Boolean = getParam(11, 1) != 0

	/** 20% basic ventilation E-aspirator a **/
	fun get_esaugbel_ein() : Boolean = getParam(12, 1) != 0

	/** Recirculation damper in OFF mode open **/
	fun get_umluft_aus() : Boolean = getParam(13, 1) != 0

	/** Solar influence not active **/
	fun get_sol_aus() : Boolean = getParam(14, 1) != 0

	/** "-1 ° C" Hot Country **/
	fun get_heissland_1() : Boolean = getParam(15, 1) != 0

	/** Desert lands with sand **/
	fun get_wuestenland() : Boolean = getParam(16, 1) != 0

	/** Basic ventilation characteristics **/
	fun get_gbl_knl() : Int = getParam(17, 3)

	/** Pressure characteristic curve **/
	fun get_p_knl() : Int = getParam(20, 4)

	/** Transmission shift point increase in cooling power deficit **/
	fun get_gspa_kla_kuehl() : Boolean = getParam(24, 1) != 0

	/** Transmission shift point increase in heating power deficit **/
	fun get_gspa_kla_heiz() : Boolean = getParam(25, 1) != 0

	/** Dew Point No **/
	fun get_tps_nvh() : Boolean = getParam(26, 1) != 0

	/** Room sensor in DBE available **/
	fun get_ifdbe_vh() : Boolean = getParam(27, 1) != 0

	/** Utilization of residual heat available **/
	fun get_rest_vh() : Boolean = getParam(28, 1) != 0

	/** Display "Maxcool" (US only) **/
	fun get_maxcool() : Boolean = getParam(29, 1) != 0

	/** Autom. Default logic air distribution **/
	fun get_asl_lvt() : Boolean = getParam(30, 1) != 0

	/** Autom. Default logic blower **/
	fun get_asl_gbl() : Boolean = getParam(31, 1) != 0

	override fun toString(): String {
		return """
			ZWP_NVH: ${get_zwp_nvh()}
			UMLUFT_UBG: ${get_umluft_ubg()}
			RHT_EIN: ${get_rht_ein()}
			GBA_MAN: ${get_gba_man()}
			GBL_40: ${get_gbl_40()}
			SUS_EIN: ${get_sus_ein()}
			SUS_AUS: ${get_sus_aus()}
			KFK_AUS: ${get_kfk_aus()}
			KALTLAND_1: ${get_kaltland_1()}
			HEISSLAND_2: ${get_heissland_2()}
			KALTLAND_2: ${get_kaltland_2()}
			UMLUFT_EIN: ${get_umluft_ein()}
			ESAUGBEL_EIN: ${get_esaugbel_ein()}
			UMLUFT_AUS: ${get_umluft_aus()}
			SOL_AUS: ${get_sol_aus()}
			HEISSLAND_1: ${get_heissland_1()}
			WUESTENLAND: ${get_wuestenland()}
			GBL_KNL: ${get_gbl_knl()}
			P_KNL: ${get_p_knl()}
			GSPA_KLA_KUEHL: ${get_gspa_kla_kuehl()}
			GSPA_KLA_HEIZ: ${get_gspa_kla_heiz()}
			TPS_NVH: ${get_tps_nvh()}
			IFDBE_VH: ${get_ifdbe_vh()}
			REST_VH: ${get_rest_vh()}
			MAXCOOL: ${get_maxcool()}
			ASL_LVT: ${get_asl_lvt()}
			ASL_GBL: ${get_asl_gbl()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A8, o, l)
}
