use fptueventclub;
-- Insert Account Role
INSERT INTO `fptueventclub`.`fev_account_role` (`role`) VALUES ('Admin');
INSERT INTO `fptueventclub`.`fev_account_role` (`role`) VALUES ('User');

-- Insert Account
INSERT INTO `fptueventclub`.`fev_account` (`username`, `password`, `role`) VALUES ('sa', '123', '1');
INSERT INTO `fptueventclub`.`fev_account` (`username`, `password`, `role`) VALUES ('hoaiem', '123', '2');
INSERT INTO `fptueventclub`.`fev_account` (`username`, `password`, `role`) VALUES ('bachtoan', '123', '2');

-- Insert Member Position
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Collaborator');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Member');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Vice Chief');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Chief');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Human Resource');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Finacial Management');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Adviser');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('Vice President');
INSERT INTO `fptueventclub`.`fev_member_position` (`position`) VALUES ('President');

-- Insert Member Status
INSERT INTO `fptueventclub`.`fev_member_status` (`status`) VALUES ('Working');
INSERT INTO `fptueventclub`.`fev_member_status` (`status`) VALUES ('Reserving');
INSERT INTO `fptueventclub`.`fev_member_status` (`status`) VALUES ('Other');

-- Insert Member
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`, `note`) VALUES ('1', 'Vũ Ngọc An ', 'SE63231', '1997-12-14', 'Male', 'Long An', '1674656691', '1', '1', '1', '');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('2', 'Trần Nguỵ Nhật Anh', 'SE62096', '1996-08-23', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('3', 'Lê Huỳnh Duy Anh', 'SE62084', '1996-11-10', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('4', 'Phạm Hoàng Tuấn Anh', 'SE63051', '1998-08-08', 'Male', 'Dong Nai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('5', 'Nguyễn Hồng Anh', 'SE62597', '1997-03-11', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('6', 'Văn Đức Quốc Anh', 'SE62841', '1998-05-05', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('7', 'Nguyễn Huỳnh Chiêu', 'Se62604', '1997-11-09', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('8', 'Huỳnh Đạt', 'SE63263', '1998-03-02', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('9', 'Trần Huỳnh Đức', 'SB61474', '1998-01-01', 'Male', 'Tay ninh', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('10', 'Dương Trùng Dương', 'SB61226', '1998-11-28', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('11', 'Cao Trọng Duy', 'SE63385', '1998-10-17', 'Male', 'Long An', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('12', 'Nguyễn Đức Duy ', 'SB61414', '1998-10-31', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('13', 'Võ Thị Thùy Duyên', 'SB61159', '1997-04-30', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('14', 'Cao Thanh Mỹ Duyên', 'SB61270', '1996-09-03', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('15', 'Võ Hoài Em', 'SE62399', '1997-12-22', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('16', 'Nguyễn Hương Giang', 'SB61269', '1998-10-06', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('17', 'Nguyễn Thị Thu Hà', 'SB61407', '1998-09-23', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('18', 'Nguyễn Ân Thiện Hải', 'SE62324', '1997-03-04', 'Male', 'Tay ninh', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('19', 'Lưu Thị Thúy Hằng', 'SB61153', '1997-09-30', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('20', 'Phạm Hoàng Hiệp', 'SE62601', '1997-05-06', 'Male', 'Long An', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('21', 'Trần Nho  Hiếu', 'SE61591', '1995-02-21', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('22', 'Trương Thị Mỹ Hiếu', 'SB61462', '1998-06-30', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('23', 'Võ Tá  Hoài', 'Sb61453', '1998-06-07', 'Male', 'Dong Nai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('24', 'Đoàn Thanh Kim Hoàng', 'Se62982', '1998-04-17', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('25', 'Nguyễn Huy  Hoàng', 'SE62442', '1997-03-11', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('26', 'Đặng Bá Quốc Hưng', 'SB61404', '1998-10-26', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('27', 'Võ Tiến  Hưng', 'SE63354', '1998-12-05', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('28', 'Bùi Đặng Thạnh Hưng', 'SE62454', '1997-11-25', 'Male', 'Tay ninh', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('29', 'Lê Thị Thu Hường', 'SB61465', '1996-05-22', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('30', 'Đỗ Ngọc Huy', 'SE62833', '1998-04-27', 'Male', 'Long An', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('31', 'Phương Gia Khải', 'se62465', '1997-04-02', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('32', 'Phạm Thành Khang', 'SB61134', '1996-02-26', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('33', 'Đào Quốc Khang', 'Se62188', '1997-07-11', 'Male', 'Dong Nai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('34', 'Trần Anh Kiệt', 'SE61469', '1995-03-13', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('35', 'Nguyễn Minh Luận', 'SE62431', '1997-09-21', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('36', 'Phạm Quang Lực', 'SE63148', '1998-12-14', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('37', 'Nguyễn Quang Lưu', 'SB61332', '1998-09-03', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('38', 'Trần Cao Minh', 'SE62417', '1997-05-23', 'Male', 'Tay ninh', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('39', 'Nguyễn Trần Anh Minh', 'SE62969', '1997-12-28', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('40', 'Vũ Nhật Minh', 'SE61390', '1993-06-01', 'Male', 'Long An', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('41', 'Đậu Thuý My', 'SB61397', '1998-09-22', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('42', 'Nguyễn Thị Kim Bích Ngân', 'SE63240', '1998-10-01', 'Male', 'Dong Nai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('43', 'Tôn Thất Minh Nhật', 'SE61685', '1994-02-11', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('44', 'Hoàng Thị Thanh Nhi', 'SB61106', '1996-07-11', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('45', 'Nguyễn Dương Yến Nhi', 'SB60959', '1996-09-19', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('46', 'Hồ Nguyễn Yến Nhi', 'Sb 61440', '1998-10-13', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('47', 'Lê Thịnh Phát', 'SB61096', '1997-05-24', 'Male', 'Tay ninh', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('48', 'Nguyễn Thành Phát', 'SB61037', '1997-05-11', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('49', 'Dương Vũ Anh Phúc', 'SB61099', '1997-08-17', 'Male', 'Long An', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('50', 'Phạm Lê Uyên Phương', 'SB61260', '1998-04-25', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('51', 'Nguyễn Hồng Thu Phương', 'SE63330', '1998-05-16', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('52', 'Lê Trọng Quảng', 'SE62994', '1998-07-27', 'Male', 'Dong Nai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('53', 'Bùi Thị Xuân Quỳnh', 'SB61460', '1997-12-20', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('54', 'Lý Phước Sang', 'SE61461', '1997-09-12', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('55', 'Nguyễn Danh Đắc Sang', 'SE62608', '1997-10-26', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('56', 'Trần Công Sinh', 'se62637', '1997-05-16', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('57', 'Phan Minh Sung', 'SE63244', '1998-06-02', 'Male', 'Tay ninh', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('58', 'Hoàng Nhất Duy Tài', 'SB60751', '1994-07-26', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('59', 'Nguyễn Thanh Tân', 'SE63184', '1998-05-29', 'Male', 'Long An', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('60', 'Cao Hoàng Thái', 'SE62651', '1995-10-09', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('61', 'Phan Thị Diễm Thắm', 'SB61466', '1998-02-25', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('62', 'Diệp Phương Thanh', 'SB60999', '1996-01-01', 'Male', 'Dong Nai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('63', 'Lê Phúc Thịnh', 'SE61759', '1996-08-20', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('64', 'Đoàn Đức Thịnh', 'SE62981', '1998-01-03', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('65', 'Nguyễn Hữu Thuận', 'SE62363', '1997-05-05', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('66', 'Tô Thành Thuyền', 'se61437', '1995-11-12', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('67', 'Nguyễn Võ Đoan Trang', 'SB60700', '1994-04-20', 'Male', 'Tay ninh', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('68', 'Nguyễn Huỳnh Kim Trang', 'SB60701', '1997-09-12', 'Male', 'Quang Nam', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('69', 'Mai Nguyễn Phương Trang', 'SB61189', '1998-08-08', 'Male', 'Long An', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('70', 'Nguyễn Khai Trí', 'SE61538', '1995-02-27', 'Male', 'Quang Ngai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('71', 'Nguyễn Hồng Anh Tuấn', 'SE62901', '1998-02-12', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('72', 'Hoàng Trọng Thanh Tùng', 'SE61694', '1995-01-24', 'Male', 'Dong Nai', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('73', 'Phạm Thị Tường Vi', 'Se62436', '1997-04-12', 'Male', 'Dak Lak', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('74', 'Trần Nguyễn Khánh Vy', 'SE62670', '1997-11-07', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('75', 'Nguyễn Cảnh Xuân', 'SE63368', '1998-10-21', 'Male', 'TP.HCM', '1674656691', '1', '1', '1');
INSERT INTO `fptueventclub`.`fev_member` (`id`, `fullname`, `studentID`, `birthdate`, `sex`, `address`, `phone`, `position`, `status`, `point`) VALUES ('76', 'Lâm Hoài Nam', 'SE63351', '1998-03-31', 'Male', 'Gia Lai', '1674656691', '1', '1', '1');

-- Insert Event
INSERT INTO `fptueventclub`.`fev_event` (`name`, `start`, `end`, `time`, `place`, `leader`) VALUES ('FPTU First Step', '2018-10-20', '2018-11-20', '2018-11-11', 'Quang Trung Software City', '8');
INSERT INTO `fptueventclub`.`fev_event` (`name`, `start`, `end`, `time`, `place`, `leader`) VALUES ('Trung Thu Am Ap', '2018-09-20', '2018-10-20', '2018-10-17', 'Hoc Mon', '7');
INSERT INTO `fptueventclub`.`fev_event` (`name`, `start`, `end`, `time`, `place`, `leader`) VALUES ('Vietnames Teacher Day', '2018-10-20', '2018-11-25', '2018-11-20', 'Innovation Building', '6');

-- Insert Event Member
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('1', '1');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('1', '2');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('1', '3');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('1', '4');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('1', '5');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('2', '3');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('2', '5');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('2', '7');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('3', '1');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('3', '2');
INSERT INTO `fptueventclub`.`fev_event_member` (`event`, `member`) VALUES ('3', '3');

-- Insert Feedback Status
INSERT INTO `fptueventclub`.`fev_feedback_status` (`status`) VALUES ('Read');
INSERT INTO `fptueventclub`.`fev_feedback_status` (`status`) VALUES ('Draf');
INSERT INTO `fptueventclub`.`fev_feedback_status` (`status`) VALUES ('Review');

-- Insert Feedback
INSERT INTO `fptueventclub`.`fev_feedback` (`content`, `status`) VALUES ('Your club so good', '1');
INSERT INTO `fptueventclub`.`fev_feedback` (`content`, `status`) VALUES ('How to regist  ?', '2');
INSERT INTO `fptueventclub`.`fev_feedback` (`content`, `status`) VALUES ('What is FEV stand for ?', '3');

-- Insert Transaction Type
INSERT INTO `fptueventclub`.`fev_transaction_type` (`type`) VALUES ('Withdraw');
INSERT INTO `fptueventclub`.`fev_transaction_type` (`type`) VALUES ('Deposit');
INSERT INTO `fptueventclub`.`fev_transaction_type` (`type`) VALUES ('Donate');
INSERT INTO `fptueventclub`.`fev_transaction_type` (`type`) VALUES ('Other');

-- Insert Transaction 
INSERT INTO `fptueventclub`.`fev_transaction` (`type`, `content`, `money`, `burden`) VALUES ('2', 'June Support Money', '500000', '2');
INSERT INTO `fptueventclub`.`fev_transaction` (`type`, `content`, `money`, `burden`) VALUES ('2', 'August Support Money', '500000', '2');
INSERT INTO `fptueventclub`.`fev_transaction` (`type`, `content`, `money`, `burden`) VALUES ('2', 'Set up', '650000', '2');
INSERT INTO `fptueventclub`.`fev_transaction` (`type`, `content`, `money`, `burden`) VALUES ('1', 'Club Meeting', '350000', '1');
INSERT INTO `fptueventclub`.`fev_transaction` (`type`, `content`, `money`, `burden`) VALUES ('1', 'Capstone Project', '600000', '1');


-- Insert Iventory Status
INSERT INTO `fptueventclub`.`fev_inventory_status` (`status`) VALUES ('Borrowed');
INSERT INTO `fptueventclub`.`fev_inventory_status` (`status`) VALUES ('Free');
INSERT INTO `fptueventclub`.`fev_inventory_status` (`status`) VALUES ('Unknow');
INSERT INTO `fptueventclub`.`fev_inventory_status` (`status`) VALUES ('Other');

-- Insert Inventory Item
INSERT INTO `fptueventclub`.`fev_inventory_item` (`name`) VALUES ('Teambuilding Banner');
INSERT INTO `fptueventclub`.`fev_inventory_item` (`name`) VALUES ('Bucket');
INSERT INTO `fptueventclub`.`fev_inventory_item` (`name`) VALUES ('Logo');
INSERT INTO `fptueventclub`.`fev_inventory_item` (`name`) VALUES ('Sticker');

-- Insert Inventory
INSERT INTO `fptueventclub`.`fev_inventory` (`item`, `quantity`, `holder`, `status`) VALUES ('1', '2', '1', '1');
INSERT INTO `fptueventclub`.`fev_inventory` (`item`, `quantity`, `holder`, `status`) VALUES ('2', '1', '2', '2');
INSERT INTO `fptueventclub`.`fev_inventory` (`item`, `quantity`, `holder`, `status`) VALUES ('3', '1', '3', '3');
INSERT INTO `fptueventclub`.`fev_inventory` (`item`, `quantity`, `holder`, `status`) VALUES ('4', '1', '4', '4');

-- Insert Position
INSERT INTO `fptueventclub`.`fev_member_group` (`group`) VALUES ('Plan');
INSERT INTO `fptueventclub`.`fev_member_group` (`group`) VALUES ('Implement');
INSERT INTO `fptueventclub`.`fev_member_group` (`group`) VALUES ('Media');
INSERT INTO `fptueventclub`.`fev_member_group` (`group`) VALUES ('President');
INSERT INTO `fptueventclub`.`fev_member_group` (`group`) VALUES ('Advise');

-- Insert Vote Key
INSERT INTO `fptueventclub`.`fev_vote_key` (`key`, `priority`, `isActive`) VALUES ('BTH', '1', b'1');
INSERT INTO `fptueventclub`.`fev_vote_key` (`key`, `priority`, `isActive`) VALUES ('BTT', '1', b'1');
INSERT INTO `fptueventclub`.`fev_vote_key` (`key`, `priority`, `isActive`) VALUES ('BKH', '1', b'1');
INSERT INTO `fptueventclub`.`fev_vote_key` (`key`, `priority`, `isActive`) VALUES ('BDH', '2', b'1');
INSERT INTO `fptueventclub`.`fev_vote_key` (`key`, `priority`, `isActive`) VALUES ('BCN', '3', b'1');
INSERT INTO `fptueventclub`.`fev_vote_key` (`key`, `priority`, `isActive`) VALUES ('BCV', '2', b'1');

-- Insert Vote Candidate
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('1', '4', '1', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('2', '4', '2', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('3', '4', '3', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('4', '4', '1', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('5', '4', '1', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('6', '4', '2', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('7', '4', '2', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('8', '4', '3', '0');
INSERT INTO `fptueventclub`.`fev_vote_candidate` (`member`, `position`, `group`, `total`) VALUES ('9', '4', '3', '0');

-- Insert Vote
INSERT INTO `fptueventclub`.`fev_vote` (`candidate`, `key`) VALUES ('1', '1');
INSERT INTO `fptueventclub`.`fev_vote` (`candidate`, `key`) VALUES ('2', '1');
INSERT INTO `fptueventclub`.`fev_vote` (`candidate`, `key`) VALUES ('3', '1');
INSERT INTO `fptueventclub`.`fev_vote` (`candidate`, `key`) VALUES ('2', '2');
INSERT INTO `fptueventclub`.`fev_vote` (`candidate`, `key`) VALUES ('4', '2');
INSERT INTO `fptueventclub`.`fev_vote` (`candidate`, `key`) VALUES ('7', '2');


