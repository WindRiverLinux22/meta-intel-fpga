LINUX_VERSION = "5.4.64"
LINUX_VERSION_SUFFIX = "-lts"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCREV = "6003ebf4e724fe26f648195b8ebd4e259320b42b"

include linux-socfpga.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append_agilex = " file://jffs2.scc file://gpio_sys.scc "
SRC_URI_append_stratix10 = " file://jffs2.scc file://gpio_sys.scc "
SRC_URI_append_arria10 = " file://lbdaf.scc "
SRC_URI_append_cyclone5 = " file://lbdaf.scc "
SRC_URI_append_arria5 = " file://lbdaf.scc "