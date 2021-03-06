// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStream(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  companion object {
    /**
     * Container for method_bind pointers for AudioStream
     */
    private object __method_bind {
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStream".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }}
  }
}
