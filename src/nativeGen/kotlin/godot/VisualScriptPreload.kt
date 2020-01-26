// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptPreload internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getPreload(): Resource {
    TODO()
  }

  fun setPreload(resource: Resource) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptPreload = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPreload".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptPreload" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptPreload(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptPreload
     */
    private object __method_bind {
      val get_preload: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPreload".cstr.ptr,
              "get_preload".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_preload" }
            }
          }

      val set_preload: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPreload".cstr.ptr,
              "set_preload".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_preload" }
            }
          }
    }
  }
}
