// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _ResourceSaver(
  _handle: COpaquePointer
) : Object(_handle) {
  fun getRecognizedExtensions(type: Resource): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getRecognizedExtensions.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun save(
    path: String,
    resource: Resource,
    flags: Int = 0
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(resource))
    _args.add(Variant.fromAny(flags))
    val _ret = __method_bind.save.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  enum class SaverFlags(
    val value: Int
  ) {
    FLAG_RELATIVE_PATHS(1),

    FLAG_BUNDLE_RESOURCES(2),

    FLAG_CHANGE_PATH(4),

    FLAG_OMIT_EDITOR_PROPERTIES(8),

    FLAG_SAVE_BIG_ENDIAN(16),

    FLAG_COMPRESS(32),

    FLAG_REPLACE_SUBRESOURCE_PATHS(64);

    companion object {
      fun from(value: Int): SaverFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val Instance: _ResourceSaver
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("_ResourceSaver".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton _ResourceSaver" }
        _ResourceSaver(
          handle
        )
      }
    val FLAG_BUNDLE_RESOURCES: Int = 2

    val FLAG_CHANGE_PATH: Int = 4

    val FLAG_COMPRESS: Int = 32

    val FLAG_OMIT_EDITOR_PROPERTIES: Int = 8

    val FLAG_RELATIVE_PATHS: Int = 1

    val FLAG_REPLACE_SUBRESOURCE_PATHS: Int = 64

    val FLAG_SAVE_BIG_ENDIAN: Int = 16

    /**
     * Container for method_bind pointers for _ResourceSaver
     */
    private object __method_bind {
      val getRecognizedExtensions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceSaver".cstr.ptr,
            "get_recognized_extensions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions" }
        }
      val save: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceSaver".cstr.ptr,
            "save".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save" }
        }}
  }
}
