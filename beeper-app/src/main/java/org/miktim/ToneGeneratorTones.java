package org.miktim;

import android.media.ToneGenerator;

public final class ToneGeneratorTones {

    public static final String[] getNames() {
        return sToneNames;
    }
    public static final int[] getValues() {
        return sToneValues;
    }
    private static final String[] sToneNames = new String[]{
            "TONE_DTMF_0",
            "TONE_DTMF_1",
            "TONE_DTMF_2",
            "TONE_DTMF_3",
            "TONE_DTMF_4",
            "TONE_DTMF_5",
            "TONE_DTMF_6",
            "TONE_DTMF_7",
            "TONE_DTMF_8",
            "TONE_DTMF_9",
            "TONE_DTMF_A",
            "TONE_DTMF_B",
            "TONE_DTMF_C",
            "TONE_DTMF_D",
            "TONE_SUP_DIAL",
            "TONE_SUP_BUSY",
            "TONE_SUP_CONGESTION",
            "TONE_SUP_RADIO_ACK",
            "TONE_SUP_RADIO_NOTAVAIL",
            "TONE_SUP_ERROR",
            "TONE_SUP_CALL_WAITING",
            "TONE_SUP_RINGTONE",
            "TONE_PROP_BEEP",
            "TONE_PROP_ACK",
            "TONE_PROP_NACK",
            "TONE_PROP_PROMPT",
            "TONE_PROP_BEEP2",
            "TONE_SUP_INTERCEPT",
            "TONE_SUP_INTERCEPT_ABBREV",
            "TONE_SUP_CONGESTION_ABBREV",
            "TONE_SUP_CONFIRM",
            "TONE_SUP_PIP",
            "TONE_CDMA_DIAL_TONE_LITE",
            "TONE_CDMA_NETWORK_USA_RINGBACK",
            "TONE_CDMA_INTERCEPT",
            "TONE_CDMA_ABBR_INTERCEPT",
            "TONE_CDMA_REORDER",
            "TONE_CDMA_ABBR_REORDER",
            "TONE_CDMA_NETWORK_BUSY",
            "TONE_CDMA_CONFIRM",
            "TONE_CDMA_ANSWER",
            "TONE_CDMA_NETWORK_CALLWAITING",
            "TONE_CDMA_PIP",
            "TONE_CDMA_CALL_SIGNAL_ISDN_NORMAL",
            "TONE_CDMA_CALL_SIGNAL_ISDN_INTERGROUP",
            "TONE_CDMA_CALL_SIGNAL_ISDN_SP_PRI",
            "TONE_CDMA_CALL_SIGNAL_ISDN_PAT3",
            "TONE_CDMA_CALL_SIGNAL_ISDN_PING_RING",
            "TONE_CDMA_CALL_SIGNAL_ISDN_PAT5",
            "TONE_CDMA_CALL_SIGNAL_ISDN_PAT6",
            "TONE_CDMA_CALL_SIGNAL_ISDN_PAT7",
            "TONE_CDMA_HIGH_L",
            "TONE_CDMA_MED_L",
            "TONE_CDMA_LOW_L",
            "TONE_CDMA_HIGH_SS",
            "TONE_CDMA_MED_SS",
            "TONE_CDMA_LOW_SS",
            "TONE_CDMA_HIGH_SSL",
            "TONE_CDMA_MED_SSL",
            "TONE_CDMA_LOW_SSL",
            "TONE_CDMA_HIGH_SS_2",
            "TONE_CDMA_MED_SS_2",
            "TONE_CDMA_LOW_SS_2",
            "TONE_CDMA_HIGH_SLS",
            "TONE_CDMA_MED_SLS",
            "TONE_CDMA_LOW_SLS",
            "TONE_CDMA_HIGH_S_X4",
            "TONE_CDMA_MED_S_X4",
            "TONE_CDMA_LOW_S_X4",
            "TONE_CDMA_HIGH_PBX_L",
            "TONE_CDMA_MED_PBX_L",
            "TONE_CDMA_LOW_PBX_L",
            "TONE_CDMA_HIGH_PBX_SS",
            "TONE_CDMA_MED_PBX_SS",
            "TONE_CDMA_LOW_PBX_SS",
            "TONE_CDMA_HIGH_PBX_SSL",
            "TONE_CDMA_MED_PBX_SSL",
            "TONE_CDMA_LOW_PBX_SSL",
            "TONE_CDMA_HIGH_PBX_SLS",
            "TONE_CDMA_MED_PBX_SLS",
            "TONE_CDMA_LOW_PBX_SLS",
            "TONE_CDMA_HIGH_PBX_S_X4",
            "TONE_CDMA_MED_PBX_S_X4",
            "TONE_CDMA_LOW_PBX_S_X4",
            "TONE_CDMA_ALERT_NETWORK_LITE",
            "TONE_CDMA_ALERT_AUTOREDIAL_LITE",
            "TONE_CDMA_ONE_MIN_BEEP",
            "TONE_CDMA_KEYPAD_VOLUME_KEY_LITE",
            "TONE_CDMA_PRESSHOLDKEY_LITE",
            "TONE_CDMA_ALERT_INCALL_LITE",
            "TONE_CDMA_EMERGENCY_RINGBACK",
            "TONE_CDMA_ALERT_CALL_GUARD",
            "TONE_CDMA_SOFT_ERROR_LITE",
            "TONE_CDMA_CALLDROP_LITE",
            "TONE_CDMA_NETWORK_BUSY_ONE_SHOT",
            "TONE_CDMA_ABBR_ALERT",
            "TONE_CDMA_SIGNAL_OFF"
    };
    private static final int[] sToneValues = new int[]{
            ToneGenerator.TONE_DTMF_0,
            ToneGenerator.TONE_DTMF_1,
            ToneGenerator.TONE_DTMF_2,
            ToneGenerator.TONE_DTMF_3,
            ToneGenerator.TONE_DTMF_4,
            ToneGenerator.TONE_DTMF_5,
            ToneGenerator.TONE_DTMF_6,
            ToneGenerator.TONE_DTMF_7,
            ToneGenerator.TONE_DTMF_8,
            ToneGenerator.TONE_DTMF_9,
            ToneGenerator.TONE_DTMF_A,
            ToneGenerator.TONE_DTMF_B,
            ToneGenerator.TONE_DTMF_C,
            ToneGenerator.TONE_DTMF_D,
            ToneGenerator.TONE_SUP_DIAL,
            ToneGenerator.TONE_SUP_BUSY,
            ToneGenerator.TONE_SUP_CONGESTION,
            ToneGenerator.TONE_SUP_RADIO_ACK,
            ToneGenerator.TONE_SUP_RADIO_NOTAVAIL,
            ToneGenerator.TONE_SUP_ERROR,
            ToneGenerator.TONE_SUP_CALL_WAITING,
            ToneGenerator.TONE_SUP_RINGTONE,
            ToneGenerator.TONE_PROP_BEEP,
            ToneGenerator.TONE_PROP_ACK,
            ToneGenerator.TONE_PROP_NACK,
            ToneGenerator.TONE_PROP_PROMPT,
            ToneGenerator.TONE_PROP_BEEP2,
            ToneGenerator.TONE_SUP_INTERCEPT,
            ToneGenerator.TONE_SUP_INTERCEPT_ABBREV,
            ToneGenerator.TONE_SUP_CONGESTION_ABBREV,
            ToneGenerator.TONE_SUP_CONFIRM,
            ToneGenerator.TONE_SUP_PIP,
            ToneGenerator.TONE_CDMA_DIAL_TONE_LITE,
            ToneGenerator.TONE_CDMA_NETWORK_USA_RINGBACK,
            ToneGenerator.TONE_CDMA_INTERCEPT,
            ToneGenerator.TONE_CDMA_ABBR_INTERCEPT,
            ToneGenerator.TONE_CDMA_REORDER,
            ToneGenerator.TONE_CDMA_ABBR_REORDER,
            ToneGenerator.TONE_CDMA_NETWORK_BUSY,
            ToneGenerator.TONE_CDMA_CONFIRM,
            ToneGenerator.TONE_CDMA_ANSWER,
            ToneGenerator.TONE_CDMA_NETWORK_CALLWAITING,
            ToneGenerator.TONE_CDMA_PIP,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_NORMAL,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_INTERGROUP,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_SP_PRI,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT3,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PING_RING,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT5,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT6,
            ToneGenerator.TONE_CDMA_CALL_SIGNAL_ISDN_PAT7,
            ToneGenerator.TONE_CDMA_HIGH_L,
            ToneGenerator.TONE_CDMA_MED_L,
            ToneGenerator.TONE_CDMA_LOW_L,
            ToneGenerator.TONE_CDMA_HIGH_SS,
            ToneGenerator.TONE_CDMA_MED_SS,
            ToneGenerator.TONE_CDMA_LOW_SS,
            ToneGenerator.TONE_CDMA_HIGH_SSL,
            ToneGenerator.TONE_CDMA_MED_SSL,
            ToneGenerator.TONE_CDMA_LOW_SSL,
            ToneGenerator.TONE_CDMA_HIGH_SS_2,
            ToneGenerator.TONE_CDMA_MED_SS_2,
            ToneGenerator.TONE_CDMA_LOW_SS_2,
            ToneGenerator.TONE_CDMA_HIGH_SLS,
            ToneGenerator.TONE_CDMA_MED_SLS,
            ToneGenerator.TONE_CDMA_LOW_SLS,
            ToneGenerator.TONE_CDMA_HIGH_S_X4,
            ToneGenerator.TONE_CDMA_MED_S_X4,
            ToneGenerator.TONE_CDMA_LOW_S_X4,
            ToneGenerator.TONE_CDMA_HIGH_PBX_L,
            ToneGenerator.TONE_CDMA_MED_PBX_L,
            ToneGenerator.TONE_CDMA_LOW_PBX_L,
            ToneGenerator.TONE_CDMA_HIGH_PBX_SS,
            ToneGenerator.TONE_CDMA_MED_PBX_SS,
            ToneGenerator.TONE_CDMA_LOW_PBX_SS,
            ToneGenerator.TONE_CDMA_HIGH_PBX_SSL,
            ToneGenerator.TONE_CDMA_MED_PBX_SSL,
            ToneGenerator.TONE_CDMA_LOW_PBX_SSL,
            ToneGenerator.TONE_CDMA_HIGH_PBX_SLS,
            ToneGenerator.TONE_CDMA_MED_PBX_SLS,
            ToneGenerator.TONE_CDMA_LOW_PBX_SLS,
            ToneGenerator.TONE_CDMA_HIGH_PBX_S_X4,
            ToneGenerator.TONE_CDMA_MED_PBX_S_X4,
            ToneGenerator.TONE_CDMA_LOW_PBX_S_X4,
            ToneGenerator.TONE_CDMA_ALERT_NETWORK_LITE,
            ToneGenerator.TONE_CDMA_ALERT_AUTOREDIAL_LITE,
            ToneGenerator.TONE_CDMA_ONE_MIN_BEEP,
            ToneGenerator.TONE_CDMA_KEYPAD_VOLUME_KEY_LITE,
            ToneGenerator.TONE_CDMA_PRESSHOLDKEY_LITE,
            ToneGenerator.TONE_CDMA_ALERT_INCALL_LITE,
            ToneGenerator.TONE_CDMA_EMERGENCY_RINGBACK,
            ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD,
            ToneGenerator.TONE_CDMA_SOFT_ERROR_LITE,
            ToneGenerator.TONE_CDMA_CALLDROP_LITE,
            ToneGenerator.TONE_CDMA_NETWORK_BUSY_ONE_SHOT,
            ToneGenerator.TONE_CDMA_ABBR_ALERT,
            ToneGenerator.TONE_CDMA_SIGNAL_OFF
    };

}