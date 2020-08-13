package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame SAM_V_A4 (ID: 0x02CC)
**/
object SAM_V_A4 {

	/** Spiegelverstellschalterstellung **/
	fun get_spvs_st() : Boolean = getParam(0, 1) != 0

	/** Exterior mirrors to the driving position **/
	fun get_sp_fahren() : Boolean = getParam(2, 1) != 0

	/** An exterior mirror according Garage position **/
	fun get_sp_garage() : Boolean = getParam(3, 1) != 0

	/** Outside mirror glass down **/
	fun get_sp_n_un() : Boolean = getParam(4, 1) != 0

	/** Outside mirror glass upwards **/
	fun get_sp_n_ob() : Boolean = getParam(5, 1) != 0

	/** Outside mirror glass to the right **/
	fun get_sp_n_re() : Boolean = getParam(6, 1) != 0

	/** Outside mirror glass to the left **/
	fun get_sp_n_li() : Boolean = getParam(7, 1) != 0

	override fun toString(): String {
		return """
			SPVS_ST: ${get_spvs_st()}
			SP_FAHREN: ${get_sp_fahren()}
			SP_GARAGE: ${get_sp_garage()}
			SP_N_UN: ${get_sp_n_un()}
			SP_N_OB: ${get_sp_n_ob()}
			SP_N_RE: ${get_sp_n_re()}
			SP_N_LI: ${get_sp_n_li()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A4, o, l)
}
