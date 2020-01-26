// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ViewportContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun getStretchShrink(): Int {
    TODO()
  }

  fun isStretchEnabled(): Boolean {
    TODO()
  }

  fun setStretch(enable: Boolean) {
    TODO()
  }

  fun setStretchShrink(amount: Int) {
    TODO()
  }

  companion object {
    fun new(): ViewportContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ViewportContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ViewportContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ViewportContainer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ViewportContainer
     */
    private object __method_bind {
      val get_stretch_shrink: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "get_stretch_shrink".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stretch_shrink" }
            }
          }

      val is_stretch_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "is_stretch_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_stretch_enabled" }
            }
          }

      val set_stretch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "set_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch" }
            }
          }

      val set_stretch_shrink: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "set_stretch_shrink".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch_shrink" }
            }
          }
    }
  }
}
