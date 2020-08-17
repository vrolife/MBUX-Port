
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for VS_A1 (ID 0x000B)
**/

object VS_A1 {

    	/** Gets convertible top status **/
	fun get_vdk_stat() : VDK_STAT = when(CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 6, 2)) {
		 0 -> VDK_STAT.VD_ENTR_ZW
		 1 -> VDK_STAT.VD_OFFEN
		 2 -> VDK_STAT.VD_GESCHL
		 3 -> VDK_STAT.SNV
		 else -> throw Exception("Invalid raw value for VDK_STAT")
	}
	
	/** Sets convertible top status **/
	fun set_vdk_stat(f: CanFrame, p: VDK_STAT) = CanBusNative.setFrameParameter(f, 6, 2, p.raw)
	
	/** Gets convertible top is active **/
	fun get_vdk_aktiv() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 5, 1) != 0
	
	/** Sets convertible top is active **/
	fun set_vdk_aktiv(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	
	/** Gets Approach short stroke front left window regulator **/
	fun get_fh_vl_kh() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 4, 1) != 0
	
	/** Sets Approach short stroke front left window regulator **/
	fun set_fh_vl_kh(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	
	/** Gets switch on the warning tone **/
	fun get_vdk_warn() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 3, 1) != 0
	
	/** Sets switch on the warning tone **/
	fun set_vdk_warn(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	
	/** Gets control lamp roll bar **/
	fun get_uerb_kl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 2, 1) != 0
	
	/** Sets control lamp roll bar **/
	fun set_uerb_kl(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	
	/** Gets opening trunk lid blocked **/
	fun get_hd_sperr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 1, 1) != 0
	
	/** Sets opening trunk lid blocked **/
	fun set_hd_sperr(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	
	/** Gets Approach short stroke front right window regulator **/
	fun get_fh_vr_kh() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 0, 1) != 0
	
	/** Sets Approach short stroke front right window regulator **/
	fun set_fh_vr_kh(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	
	/** Gets Message 1: "Close trunk lid" **/
	fun get_vs_m1() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 15, 1) != 0
	
	/** Sets Message 1: "Close trunk lid" **/
	fun set_vs_m1(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 15, 1, if(p) 1 else 0)
	
	/** Gets Message 2: "Close trunk partition / ski bag" **/
	fun get_vs_m2() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 14, 1) != 0
	
	/** Sets Message 2: "Close trunk partition / ski bag" **/
	fun set_vs_m2(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 14, 1, if(p) 1 else 0)
	
	/** Gets Message 3: "Start engine for convertible top operation" **/
	fun get_vs_m3() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 13, 1) != 0
	
	/** Sets Message 3: "Start engine for convertible top operation" **/
	fun set_vs_m3(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	
	/** Gets Message 4: "Lock convertible top" **/
	fun get_vs_m4() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 12, 1) != 0
	
	/** Sets Message 4: "Lock convertible top" **/
	fun set_vs_m4(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	
	/** Gets Message 5: "Trigger roll bar" **/
	fun get_vs_m5() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 11, 1) != 0
	
	/** Sets Message 5: "Trigger roll bar" **/
	fun set_vs_m5(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	
	/** Gets Message 6: "Lower roll bar" **/
	fun get_vs_m6() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 10, 1) != 0
	
	/** Sets Message 6: "Lower roll bar" **/
	fun set_vs_m6(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	
	/** Gets Message 7: "Convertible top in operation" **/
	fun get_vs_m7() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 9, 1) != 0
	
	/** Sets Message 7: "Convertible top in operation" **/
	fun set_vs_m7(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	
	/** Gets Message 8: "Convertible top is falling" **/
	fun get_vs_m8() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 8, 1) != 0
	
	/** Sets Message 8: "Convertible top is falling" **/
	fun set_vs_m8(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	
	/** Gets Message 9: "Visit convertible top workshop" **/
	fun get_vs_m9() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 23, 1) != 0
	
	/** Sets Message 9: "Visit convertible top workshop" **/
	fun set_vs_m9(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 23, 1, if(p) 1 else 0)
	
	/** Gets Message 10: "Convertible top blocked due to driving" **/
	fun get_vs_m10() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 22, 1) != 0
	
	/** Sets Message 10: "Convertible top blocked due to driving" **/
	fun set_vs_m10(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 22, 1, if(p) 1 else 0)
	
	/** Gets Message 11: "Convertible top operation please wait" **/
	fun get_vs_m11() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 21, 1) != 0
	
	/** Sets Message 11: "Convertible top operation please wait" **/
	fun set_vs_m11(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 21, 1, if(p) 1 else 0)
	
	/** Gets Message 12: "Convertible top open" **/
	fun get_vs_m12() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 20, 1) != 0
	
	/** Sets Message 12: "Convertible top open" **/
	fun set_vs_m12(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 20, 1, if(p) 1 else 0)
	
	/** Gets Message 13: "Convertible top closed" **/
	fun get_vs_m13() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 19, 1) != 0
	
	/** Sets Message 13: "Convertible top closed" **/
	fun set_vs_m13(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	
	/** Gets Message 14: "Please close ski bag" **/
	fun get_vs_m14() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 18, 1) != 0
	
	/** Sets Message 14: "Please close ski bag" **/
	fun set_vs_m14(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	
	/** Gets Rear lid locking pawl activated **/
	fun get_hd_sk_vs() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 17, 1) != 0
	
	/** Sets Rear lid locking pawl activated **/
	fun set_hd_sk_vs(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	
	/** Gets Front window regulator block FHS commands **/
	fun get_fhs_v_sperr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 16, 1) != 0
	
	/** Sets Front window regulator block FHS commands **/
	fun set_fhs_v_sperr(f: CanFrame, p: Boolean) = CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	
	/** Gets Request for convertible top control lamp **/
	fun get_vdk_kl_anf() : VDK_KL_ANF = when(CanBusNative.getECUParameterB(CanBAddrs.VS_A1, 30, 2)) {
		 0 -> VDK_KL_ANF.OFF
		 1 -> VDK_KL_ANF.DL
		 2 -> VDK_KL_ANF.BL
		 3 -> VDK_KL_ANF.NOT_DEFINED
		 else -> throw Exception("Invalid raw value for VDK_KL_ANF")
	}
	
	/** Sets Request for convertible top control lamp **/
	fun set_vdk_kl_anf(f: CanFrame, p: VDK_KL_ANF) = CanBusNative.setFrameParameter(f, 30, 2, p.raw)
	
	
}