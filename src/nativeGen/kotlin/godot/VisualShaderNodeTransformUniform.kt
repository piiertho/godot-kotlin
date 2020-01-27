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

open class VisualShaderNodeTransformUniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNodeUniform(_handle) {
  companion object {
    fun new(): VisualShaderNodeTransformUniform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformUniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeTransformUniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTransformUniform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTransformUniform =
        VisualShaderNodeTransformUniform(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTransformUniform
     */
    private object __method_bind
  }
}
