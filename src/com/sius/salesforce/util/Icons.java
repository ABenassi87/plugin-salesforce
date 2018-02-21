package com.sius.salesforce.util;

import com.intellij.icons.AllIcons;
import com.intellij.util.PlatformIcons;

import javax.swing.*;

public class Icons {
    Icon CLASS = PlatformIcons.CLASS_ICON;
    Icon INTERFACE = PlatformIcons.INTERFACE_ICON;
    Icon TRIGGER = PlatformIcons.FUNCTION_ICON;
    Icon PUBLIC = PlatformIcons.PUBLIC_ICON;
    Icon PROTECTED = PlatformIcons.PROTECTED_ICON;
    Icon PRIVATE = PlatformIcons.PRIVATE_ICON;
    Icon GLOBAL = PlatformIcons.WEB_ICON;
    Icon EXCEPTION = AllIcons.Nodes.ExceptionClass;
    Icon ENUM = AllIcons.Nodes.Enum;

    public interface ApexFileType {
        Icon CLASS = AllIcons.FileTypes.Java;
        Icon TRIGGER = AllIcons.Nodes.Function;
    }

    public interface VisualforceFileType {
        Icon COMPONENT = AllIcons.FileTypes.Xhtml;
        Icon PAGE = AllIcons.FileTypes.Xhtml;
    }


}
