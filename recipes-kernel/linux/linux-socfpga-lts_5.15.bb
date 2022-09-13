LINUX_VERSION = "5.15.50"
LINUX_VERSION_SUFFIX = "-lts"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRCREV = "c9acb386b49f5d86d33011e3e4e6383d40c4407b"

include linux-socfpga.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/config:"

SRC_URI:append:n5x = " file://jffs2.scc file://gpio_sys.scc "
SRC_URI:append:agilex = " file://jffs2.scc file://gpio_sys.scc "
SRC_URI:append:stratix10 = " file://jffs2.scc file://gpio_sys.scc "
SRC_URI:append:arria10 = " file://lbdaf.scc file://jffs2.scc file://gpio_sys.scc "
SRC_URI:append:cyclone5 = " file://lbdaf.scc "
SRC_URI:append:arria5 = " file://lbdaf.scc "
