
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for FBS_111h (ID 0x0111)
**/

object FBS_111h {

    	/** Gets FBS message to MS (8 bytes) **/
	fun get_fbs_ms() : Int = CanBusNative.getECUParameterC(CanCAddrs.FBS_111h, 0, 64)
	
	/** Sets FBS message to MS (8 bytes) **/
	fun set_fbs_ms(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}