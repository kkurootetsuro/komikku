package eu.kanade.tachiyomi.ui.cover

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import eu.kanade.tachiyomi.R

class CoverBlurPreferencesFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) { setPreferencesFromResource(R.xml.cover_blur_preferences, rootKey) }
}
