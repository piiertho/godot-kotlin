// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PanelContainer(
  _handle: COpaquePointer
) : Container(_handle) {
  companion object {
    fun new(): PanelContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PanelContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PanelContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PanelContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PanelContainer = PanelContainer(ptr)
    /**
     * Container for method_bind pointers for PanelContainer
     */
    private object __method_bind
  }
}
