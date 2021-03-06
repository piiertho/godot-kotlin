// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class EditorFileDialog(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  var access: Access
    get() {
       return getAccess() 
    }
    set(value) {
      setAccess(value.value)
    }

  var currentDir: String
    get() {
       return getCurrentDir() 
    }
    set(value) {
      setCurrentDir(value)
    }

  var currentFile: String
    get() {
       return getCurrentFile() 
    }
    set(value) {
      setCurrentFile(value)
    }

  var currentPath: String
    get() {
       return getCurrentPath() 
    }
    set(value) {
      setCurrentPath(value)
    }

  var disableOverwriteWarning: Boolean
    get() {
       return isOverwriteWarningDisabled() 
    }
    set(value) {
      setDisableOverwriteWarning(value)
    }

  var displayMode: DisplayMode
    get() {
       return getDisplayMode() 
    }
    set(value) {
      setDisplayMode(value.value)
    }

  var mode: Mode
    get() {
       return getMode() 
    }
    set(value) {
      setMode(value.value)
    }

  var showHiddenFiles: Boolean
    get() {
       return isShowingHiddenFiles() 
    }
    set(value) {
      setShowHiddenFiles(value)
    }

  /**
   * EditorFileDialog::dir_selected signal
   */
  val signalDirSelected: Signal1<String> = Signal1("dir_selected")

  /**
   * EditorFileDialog::file_selected signal
   */
  val signalFileSelected: Signal1<String> = Signal1("file_selected")

  /**
   * EditorFileDialog::files_selected signal
   */
  val signalFilesSelected: Signal1<PoolStringArray> = Signal1("files_selected")

  fun addFilter(filter: String) {
    val _arg = Variant.new(filter)
    __method_bind.addFilter.call(this._handle, listOf(_arg))
  }

  fun clearFilters() {
    __method_bind.clearFilters.call(this._handle)
  }

  fun getAccess(): Access {
    val _ret = __method_bind.getAccess.call(this._handle)
    return EditorFileDialog.Access.from(_ret.asInt())
  }

  fun getCurrentDir(): String {
    val _ret = __method_bind.getCurrentDir.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentFile(): String {
    val _ret = __method_bind.getCurrentFile.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentPath(): String {
    val _ret = __method_bind.getCurrentPath.call(this._handle)
    return _ret.asString()
  }

  fun getDisplayMode(): DisplayMode {
    val _ret = __method_bind.getDisplayMode.call(this._handle)
    return EditorFileDialog.DisplayMode.from(_ret.asInt())
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return EditorFileDialog.Mode.from(_ret.asInt())
  }

  fun getVbox(): VBoxContainer {
    val _ret = __method_bind.getVbox.call(this._handle)
    return _ret.asObject(::VBoxContainer)!!
  }

  fun invalidate() {
    __method_bind.invalidate.call(this._handle)
  }

  fun isOverwriteWarningDisabled(): Boolean {
    val _ret = __method_bind.isOverwriteWarningDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShowingHiddenFiles(): Boolean {
    val _ret = __method_bind.isShowingHiddenFiles.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAccess(access: Int) {
    val _arg = Variant.new(access)
    __method_bind.setAccess.call(this._handle, listOf(_arg))
  }

  fun setCurrentDir(dir: String) {
    val _arg = Variant.new(dir)
    __method_bind.setCurrentDir.call(this._handle, listOf(_arg))
  }

  fun setCurrentFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.setCurrentFile.call(this._handle, listOf(_arg))
  }

  fun setCurrentPath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setCurrentPath.call(this._handle, listOf(_arg))
  }

  fun setDisableOverwriteWarning(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisableOverwriteWarning.call(this._handle, listOf(_arg))
  }

  fun setDisplayMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDisplayMode.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setShowHiddenFiles(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.setShowHiddenFiles.call(this._handle, listOf(_arg))
  }

  enum class DisplayMode(
    val value: Int
  ) {
    DISPLAY_THUMBNAILS(0),

    DISPLAY_LIST(1);

    companion object {
      fun from(value: Int): DisplayMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_OPEN_FILE(0),

    MODE_OPEN_FILES(1),

    MODE_OPEN_DIR(2),

    MODE_OPEN_ANY(3),

    MODE_SAVE_FILE(4);

    companion object {
      fun from(value: Int): Mode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Access(
    val value: Int
  ) {
    ACCESS_RESOURCES(0),

    ACCESS_USERDATA(1),

    ACCESS_FILESYSTEM(2);

    companion object {
      fun from(value: Int): Access {
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
    val ACCESS_FILESYSTEM: Int = 2

    val ACCESS_RESOURCES: Int = 0

    val ACCESS_USERDATA: Int = 1

    val DISPLAY_LIST: Int = 1

    val DISPLAY_THUMBNAILS: Int = 0

    val MODE_OPEN_ANY: Int = 3

    val MODE_OPEN_DIR: Int = 2

    val MODE_OPEN_FILE: Int = 0

    val MODE_OPEN_FILES: Int = 1

    val MODE_SAVE_FILE: Int = 4

    /**
     * Container for method_bind pointers for EditorFileDialog
     */
    private object __method_bind {
      val addFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "add_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_filter" }
        }
      val clearFilters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "clear_filters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_filters" }
        }
      val getAccess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "get_access".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_access" }
        }
      val getCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "get_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
        }
      val getCurrentFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "get_current_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_file" }
        }
      val getCurrentPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "get_current_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_path" }
        }
      val getDisplayMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "get_display_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_display_mode" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getVbox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "get_vbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vbox" }
        }
      val invalidate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "invalidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method invalidate" }
        }
      val isOverwriteWarningDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "is_overwrite_warning_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overwrite_warning_disabled" }
        }
      val isShowingHiddenFiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "is_showing_hidden_files".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_showing_hidden_files" }
        }
      val setAccess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_access".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_access" }
        }
      val setCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_dir" }
        }
      val setCurrentFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_current_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_file" }
        }
      val setCurrentPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_current_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_path" }
        }
      val setDisableOverwriteWarning: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_disable_overwrite_warning".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_overwrite_warning" }
        }
      val setDisplayMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_display_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_display_mode" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setShowHiddenFiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "set_show_hidden_files".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_hidden_files" }
        }}
  }
}
