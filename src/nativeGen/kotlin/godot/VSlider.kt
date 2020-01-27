// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VSlider internal constructor(
  _handle: COpaquePointer
) : Slider(_handle) {
  companion object {
    fun new(): VSlider = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VSlider".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VSlider" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VSlider(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VSlider = VSlider(ptr)
    /**
     * Container for method_bind pointers for VSlider
     */
    private object __method_bind
  }
}
