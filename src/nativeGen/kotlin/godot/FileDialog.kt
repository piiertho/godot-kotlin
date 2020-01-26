// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class FileDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  fun addFilter(filter: String) {
    TODO()
  }

  fun clearFilters() {
    TODO()
  }

  fun deselectItems() {
    TODO()
  }

  fun getAccess(): Access {
    TODO()
  }

  fun getCurrentDir(): String {
    TODO()
  }

  fun getCurrentFile(): String {
    TODO()
  }

  fun getCurrentPath(): String {
    TODO()
  }

  fun getFilters(): PoolStringArray {
    TODO()
  }

  fun getLineEdit(): LineEdit {
    TODO()
  }

  fun getMode(): Mode {
    TODO()
  }

  fun getVbox(): VBoxContainer {
    TODO()
  }

  fun invalidate() {
    TODO()
  }

  fun isModeOverridingTitle(): Boolean {
    TODO()
  }

  fun isShowingHiddenFiles(): Boolean {
    TODO()
  }

  fun setAccess(access: Int) {
    TODO()
  }

  fun setCurrentDir(dir: String) {
    TODO()
  }

  fun setCurrentFile(file: String) {
    TODO()
  }

  fun setCurrentPath(path: String) {
    TODO()
  }

  fun setFilters(filters: PoolStringArray) {
    TODO()
  }

  fun setMode(mode: Int) {
    TODO()
  }

  fun setModeOverridesTitle(override: Boolean) {
    TODO()
  }

  fun setShowHiddenFiles(show: Boolean) {
    TODO()
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_OPEN_FILE(0),

    MODE_OPEN_FILES(1),

    MODE_OPEN_DIR(2),

    MODE_OPEN_ANY(3),

    MODE_SAVE_FILE(4);
  }

  enum class Access(
    val value: Int
  ) {
    ACCESS_RESOURCES(0),

    ACCESS_USERDATA(1),

    ACCESS_FILESYSTEM(2);
  }

  companion object {
    val ACCESS_FILESYSTEM: Int = 2

    val ACCESS_RESOURCES: Int = 0

    val ACCESS_USERDATA: Int = 1

    val MODE_OPEN_ANY: Int = 3

    val MODE_OPEN_DIR: Int = 2

    val MODE_OPEN_FILE: Int = 0

    val MODE_OPEN_FILES: Int = 1

    val MODE_SAVE_FILE: Int = 4

    fun new(): FileDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("FileDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton FileDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      FileDialog(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for FileDialog
     */
    private object __method_bind {
      val add_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "add_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_filter" }
            }
          }

      val clear_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "clear_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_filters" }
            }
          }

      val deselect_items: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "deselect_items".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect_items" }
            }
          }

      val get_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_access" }
            }
          }

      val get_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
            }
          }

      val get_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_file" }
            }
          }

      val get_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_path" }
            }
          }

      val get_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filters" }
            }
          }

      val get_line_edit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_line_edit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_vbox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_vbox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vbox" }
            }
          }

      val invalidate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "invalidate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method invalidate" }
            }
          }

      val is_mode_overriding_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "is_mode_overriding_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_mode_overriding_title" }
            }
          }

      val is_showing_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "is_showing_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_showing_hidden_files" }
            }
          }

      val set_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_access" }
            }
          }

      val set_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_dir" }
            }
          }

      val set_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_file" }
            }
          }

      val set_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_path" }
            }
          }

      val set_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filters" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_mode_overrides_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_mode_overrides_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode_overrides_title" }
            }
          }

      val set_show_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_show_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_show_hidden_files" }
            }
          }
    }
  }
}
