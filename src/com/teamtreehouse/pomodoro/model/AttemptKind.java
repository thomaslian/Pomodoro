package com.teamtreehouse.pomodoro.model;

/**
 * Created by Thoma on 09.06.2016.
 */
public enum AttemptKind {
    FOCUS(25 * 60, "Focus time"),
    BREAK(5 * 60, "Break time");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
