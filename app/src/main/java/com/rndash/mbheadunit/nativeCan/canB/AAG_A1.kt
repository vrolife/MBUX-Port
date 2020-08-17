
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for AAG_A1 (ID 0x0130)
**/

object AAG_A1 {

    	/** Gets Trailer brake light defective **/
	fun get_anhbl_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 7, 1) != 0
	
	/** Sets Trailer brake light defective **/
	fun set_anhbl_def(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	
	/** Gets EDW trailer monitoring alarm triggered **/
	fun get_edw_anh_alm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 3, 1) != 0
	
	/** Sets EDW trailer monitoring alarm triggered **/
	fun set_edw_anh_alm(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	
	/** Gets Trailer terminal 54 error **/
	fun get_anhkl_54_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 2, 1) != 0
	
	/** Sets Trailer terminal 54 error **/
	fun set_anhkl_54_def(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	
	/** Gets Trailer coupling not locked **/
	fun get_ahk_nok() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 1, 1) != 0
	
	/** Sets Trailer coupling not locked **/
	fun set_ahk_nok(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	
	/** Gets Trailer operation detected **/
	fun get_anh_erk() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 0, 1) != 0
	
	/** Sets Trailer operation detected **/
	fun set_anh_erk(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	
	/** Gets Right trailer turn signal defective **/
	fun get_anhbli_def_r() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 13, 1) != 0
	
	/** Sets Right trailer turn signal defective **/
	fun set_anhbli_def_r(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	
	/** Gets Right trailer tail light defective **/
	fun get_anhsl_def_r() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 12, 1) != 0
	
	/** Sets Right trailer tail light defective **/
	fun set_anhsl_def_r(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	
	/** Gets Left trailer turn signal defective **/
	fun get_anhbli_def_l() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 9, 1) != 0
	
	/** Sets Left trailer turn signal defective **/
	fun set_anhbli_def_l(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	
	/** Gets Trailer tail light on the left defective **/
	fun get_anhsl_def_l() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AAG_A1, 8, 1) != 0
	
	/** Sets Trailer tail light on the left defective **/
	fun set_anhsl_def_l(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	
	
}