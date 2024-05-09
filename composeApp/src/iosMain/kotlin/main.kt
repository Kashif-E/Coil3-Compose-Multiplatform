import androidx.compose.ui.window.ComposeUIViewController
import com.kashif.coil3.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
