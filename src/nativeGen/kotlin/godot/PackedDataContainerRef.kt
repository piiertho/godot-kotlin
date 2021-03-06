// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PackedDataContainerRef(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun size(): Int {
    val _ret = __method_bind.size.call(this._handle)
    return _ret.asInt()
  }

  companion object {
    /**
     * Container for method_bind pointers for PackedDataContainerRef
     */
    private object __method_bind {
      val size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainerRef".cstr.ptr,
            "size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method size" }
        }}
  }
}
