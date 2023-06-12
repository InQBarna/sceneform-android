package com.google.ar.sceneform.ux

import android.view.View
import android.view.ViewGroup

/**
 * @author David García (david.garcia@inqbarna.com)
 * @version 1.0 12/6/23
 */
fun <T : ViewGroup> View.getParentViewGroup(): T? {
    var current = parent
    while (current != null) {
        val viewGroup = current as? ViewGroup
        if (viewGroup != null)
            return viewGroup as T
        current = current.parent
    }
    return null
}
