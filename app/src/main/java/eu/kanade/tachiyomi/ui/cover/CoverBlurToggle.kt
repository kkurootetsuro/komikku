package eu.kanade.tachiyomi.ui.cover

import android.widget.ImageView

object CoverBlurToggle {
    var isBlurred: Boolean = false

    fun toggleBlur(imageView: ImageView) {
        isBlurred = !isBlurred
        if (isBlurred) {
            applyBlur(imageView)
        } else {
            removeBlur(imageView)
        }
    }

    private fun applyBlur(imageView: ImageView) {
        // Placeholder implementation: reduce alpha to simulate blur effect.
        imageView.alpha = 0.5f
    }

    private fun removeBlur(imageView: ImageView) {
        imageView.alpha = 1.0f
    }
}
