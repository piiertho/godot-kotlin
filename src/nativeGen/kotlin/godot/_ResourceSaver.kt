// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _ResourceSaver internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun getRecognizedExtensions(): PoolStringArray {
    TODO()
  }

  fun save(): Error {
    TODO()
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
  }

  companion object {
    val Instance: _ResourceSaver = memScoped {
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
      val get_recognized_extensions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceSaver".cstr.ptr,
              "get_recognized_extensions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions" }
            }
          }

      val save: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceSaver".cstr.ptr,
              "save".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save" }
            }
          }
    }
  }
}
