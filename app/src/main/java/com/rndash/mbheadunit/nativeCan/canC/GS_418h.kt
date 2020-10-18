
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_418h (ID 0x0418)
**/

object GS_418h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of GS_418h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.GS_418h)

	/** Gets speed step **/
	fun get_fsc() : FSC = when(CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 0, 8)) {
		 32 -> FSC.BLANK
		 49 -> FSC.ONE
		 50 -> FSC.TWO
		 51 -> FSC.THREE
		 52 -> FSC.FOUR
		 53 -> FSC.FUENF
		 54 -> FSC.SIX
		 55 -> FSC.SEVEN
		 65 -> FSC.A
		 68 -> FSC.D
		 70 -> FSC.F_ERROR_MARK
		 78 -> FSC.N
		 80 -> FSC.P
		 82 -> FSC.R
		 else -> FSC.SNV
	}
	
	/** Sets speed step **/
	fun set_fsc(f: CanFrame, p: FSC) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 8, p.raw)
	}
	
	/** Gets driving program **/
	fun get_fpc() : FPC = when(CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 8, 8)) {
		 2 -> FPC.C_MGFB_WT
		 3 -> FPC.C_MGSNN
		 4 -> FPC.C_MGBB
		 6 -> FPC.C_MGGEA
		 7 -> FPC.C_MGZSN
		 10 -> FPC.A_MGFB_WT
		 11 -> FPC.A_MGSNN
		 12 -> FPC.A_MGBB
		 14 -> FPC.A_MGGEA
		 15 -> FPC.A_MGZSN
		 18 -> FPC.S_MGFB_WT
		 19 -> FPC.S_MGSNN
		 20 -> FPC.S_MGBB
		 22 -> FPC.S_MGGEA
		 23 -> FPC.S_MGZSN
		 24 -> FPC.UP
		 25 -> FPC.DOWN
		 32 -> FPC.BLANK
		 64 -> FPC.BLANK_MGN
		 65 -> FPC.A
		 67 -> FPC.C
		 70 -> FPC.F_ERROR_MARK
		 77 -> FPC.M
		 83 -> FPC.S
		 87 -> FPC.W
		 95 -> FPC.UNDERSCORE
		 96 -> FPC.BLANK_MGW
		 97 -> FPC.A_MGN
		 99 -> FPC.C_MGN
		 109 -> FPC.M_MGN
		 115 -> FPC.S_MGN
		 119 -> FPC.W_MGN
		 127 -> FPC.__MGN
		 129 -> FPC.A_MGW
		 131 -> FPC.C_MGW
		 134 -> FPC.F_MGW
		 141 -> FPC.M_MGW
		 147 -> FPC.S_MGW
		 151 -> FPC.W_MGW
		 159 -> FPC.__MGW
		 else -> FPC.SNV
	}
	
	/** Sets driving program **/
	fun set_fpc(f: CanFrame, p: FPC) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 8, p.raw)
	}
	
	/** Gets transmission oil temperature **/
	fun get_t_get() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 16, 8)
	
	/** Sets transmission oil temperature **/
	fun set_t_get(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 8, p)
	}
	
	/** Gets Kickdown **/
	fun get_kd() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 31, 1) != 0
	
	/** Sets Kickdown **/
	fun set_kd(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 31, 1, if(p) 1 else 0)
	}
	
	/** Gets apply brake when switching on **/
	fun get_esv_bre() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 30, 1) != 0
	
	/** Sets apply brake when switching on **/
	fun set_esv_bre(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 30, 1, if(p) 1 else 0)
	}
	
	/** Gets gear mechanism variant **/
	fun get_mech() : MECH = when(CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 28, 2)) {
		 0 -> MECH.LARGE
		 1 -> MECH.SMALL
		 2 -> MECH.GROSS2
		 3 -> MECH.KLEIN2
		 else -> throw Exception("Invalid raw value for MECH")
	}
	
	/** Sets gear mechanism variant **/
	fun set_mech(f: CanFrame, p: MECH) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 28, 2, p.raw)
	}
	
	/** Gets continuously variable transmission [1], multi-step transmission [0] **/
	fun get_cvt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 27, 1) != 0
	
	/** Sets continuously variable transmission [1], multi-step transmission [0] **/
	fun set_cvt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** UNKNOWN DESCRIPTION **/
	fun get_switch() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 26, 1) != 0
	
	/** UNKNOWN DESCRIPTION **/
	fun set_switch(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets front-wheel drive [1], rear-wheel drive [0] **/
	fun get_front() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 25, 1) != 0
	
	/** Sets front-wheel drive [1], rear-wheel drive [0] **/
	fun set_front(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets all-wheel drive **/
	fun get_all_wheel() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 24, 1) != 0
	
	/** Sets all-wheel drive **/
	fun set_all_wheel(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/** Gets actual gear **/
	fun get_gic() : GIC = when(CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 36, 4)) {
		 0 -> GIC.N
		 1 -> GIC.D1
		 2 -> GIC.D2
		 3 -> GIC.D3
		 4 -> GIC.D4
		 5 -> GIC.D5
		 6 -> GIC.D6
		 7 -> GIC.D7
		 8 -> GIC.D_CVT
		 9 -> GIC.R_CVT
		 10 -> GIC.R3
		 11 -> GIC.R
		 12 -> GIC.R2
		 13 -> GIC.P
		 14 -> GIC.NO_FORCE
		 15 -> GIC.SNV
		 else -> throw Exception("Invalid raw value for GIC")
	}
	
	/** Sets actual gear **/
	fun set_gic(f: CanFrame, p: GIC) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 36, 4, p.raw)
	}
	
	/** Gets target gear **/
	fun get_gzc() : GZC = when(CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 32, 4)) {
		 0 -> GZC.N
		 1 -> GZC.D1
		 2 -> GZC.D2
		 3 -> GZC.D3
		 4 -> GZC.D4
		 5 -> GZC.D5
		 6 -> GZC.D6
		 7 -> GZC.D7
		 8 -> GZC.D_CVT
		 9 -> GZC.R_CVT
		 10 -> GZC.R3
		 11 -> GZC.R
		 12 -> GZC.R2
		 13 -> GZC.P
		 14 -> GZC.CANCEL
		 15 -> GZC.SNV
		 else -> throw Exception("Invalid raw value for GZC")
	}
	
	/** Sets target gear **/
	fun set_gzc(f: CanFrame, p: GZC) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 4, p.raw)
	}
	
	/** Gets torque loss (FFh at KSG) **/
	fun get_m_verl() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 40, 8)
	
	/** Sets torque loss (FFh at KSG) **/
	fun set_m_verl(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 40, 8, p)
	}
	
	/** Gets Gear selector lever position (NAG, KSG, CVT) **/
	fun get_whst() : WHST = when(CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 50, 3)) {
		 0 -> WHST.P
		 1 -> WHST.R
		 2 -> WHST.N
		 4 -> WHST.D
		 7 -> WHST.SNV
		 else -> throw Exception("Invalid raw value for WHST")
	}
	
	/** Sets Gear selector lever position (NAG, KSG, CVT) **/
	fun set_whst(f: CanFrame, p: WHST) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 50, 3, p.raw)
	}
	
	/** Gets Factor wheel torque toggle 40ms + -10 **/
	fun get_fmradtgl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 49, 1) != 0
	
	/** Sets Factor wheel torque toggle 40ms + -10 **/
	fun set_fmradtgl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 49, 1, if(p) 1 else 0)
	}
	
	/** Gets Wheel torque parity factor (even parity) **/
	fun get_fmradpar() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 48, 1) != 0
	
	/** Sets Wheel torque parity factor (even parity) **/
	fun set_fmradpar(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 48, 1, if(p) 1 else 0)
	}
	
	/** Gets wheel torque factor (7FFh at KSG) **/
	fun get_fmrad() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_418h, 53, 11)
	
	/** Sets wheel torque factor (7FFh at KSG) **/
	fun set_fmrad(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 53, 11, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.GS_418h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame GS_418h (0x0418):
		|	speed step: ${get_fsc()}
		|	driving program: ${get_fpc()}
		|	transmission oil temperature: ${get_t_get()}
		|	Kickdown: ${get_kd()}
		|	apply brake when switching on: ${get_esv_bre()}
		|	gear mechanism variant: ${get_mech()}
		|	continuously variable transmission [1], multi-step transmission [0]: ${get_cvt()}
		|	None: ${get_switch()}
		|	front-wheel drive [1], rear-wheel drive [0]: ${get_front()}
		|	all-wheel drive: ${get_all_wheel()}
		|	actual gear: ${get_gic()}
		|	target gear: ${get_gzc()}
		|	torque loss (FFh at KSG): ${get_m_verl()}
		|	Gear selector lever position (NAG, KSG, CVT): ${get_whst()}
		|	Factor wheel torque toggle 40ms + -10: ${get_fmradtgl()}
		|	Wheel torque parity factor (even parity): ${get_fmradpar()}
		|	wheel torque factor (7FFh at KSG): ${get_fmrad()}
	""".trimMargin("|")
}
