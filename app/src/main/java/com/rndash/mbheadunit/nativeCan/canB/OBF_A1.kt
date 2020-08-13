package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame OBF_A1 (ID: 0x002C)
**/
object OBF_A1 {

	/** ZV lock (internal switch operated) **/
	fun get_zv_verri_is() : Boolean = getParam(0, 1) != 0

	/** ZV unlock (internal switch operated) **/
	fun get_zv_entri_is() : Boolean = getParam(1, 1) != 0

	/** Rear blind button actuated **/
	fun get_hr_bet() : Boolean = getParam(2, 1) != 0

	/** Headrest rear lift / lower actuated **/
	fun get_fks_bet() : Boolean = getParam(4, 1) != 0

	/** ESP operated on / off **/
	fun get_esp_bet() : Int = getParam(6, 2)

	/** Hazard lights a **/
	fun get_wbl_ein() : Boolean = getParam(10, 1) != 0

	/** deselect EDW tow-away protection **/
	fun get_edw_as_abw() : Boolean = getParam(13, 1) != 0

	/** deselect EDW interior protection **/
	fun get_edw_irs_abw() : Boolean = getParam(14, 1) != 0

	/** EDW glovebox contact triggered **/
	fun get_edw_hand_auf() : Boolean = getParam(15, 1) != 0

	/** Button actuated parking sensors **/
	fun get_pts_bet() : Boolean = getParam(16, 1) != 0

	override fun toString(): String {
		return """
			ZV_VERRI_IS: ${get_zv_verri_is()}
			ZV_ENTRI_IS: ${get_zv_entri_is()}
			HR_BET: ${get_hr_bet()}
			FKS_BET: ${get_fks_bet()}
			ESP_BET: ${get_esp_bet()}
			WBL_EIN: ${get_wbl_ein()}
			EDW_AS_ABW: ${get_edw_as_abw()}
			EDW_IRS_ABW: ${get_edw_irs_abw()}
			EDW_HAND_AUF: ${get_edw_hand_auf()}
			PTS_BET: ${get_pts_bet()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.OBF_A1, o, l)
}
