package app.codex.googlefeedads.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_GOOGLE_APP = Compatibility(
        name = "Google",
        packageName = "com.google.android.googlequicksearchbox",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x4285F4,
        targets = listOf(
            AppTarget(
                version = "17.34.30.ve.arm64",
            ),
        ),
    )
}
