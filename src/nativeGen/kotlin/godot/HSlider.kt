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

open class HSlider internal constructor(
  _handle: COpaquePointer
) : Slider(_handle) {
  companion object {
    fun new(): HSlider = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HSlider".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton HSlider" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HSlider(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HSlider = HSlider(ptr)
    /**
     * Container for method_bind pointers for HSlider
     */
    private object __method_bind
  }
}
