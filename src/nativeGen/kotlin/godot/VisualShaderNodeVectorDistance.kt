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

open class VisualShaderNodeVectorDistance internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    fun new(): VisualShaderNodeVectorDistance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVectorDistance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeVectorDistance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeVectorDistance(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeVectorDistance =
        VisualShaderNodeVectorDistance(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeVectorDistance
     */
    private object __method_bind
  }
}
