use guest_house;
INSERT INTO Role (RoleID, RoleName) VALUES (1, 'Người tìm trọ');
INSERT INTO Role (RoleID, RoleName) VALUES (2, 'Người cho thuê trọ');

-- Thêm dữ liệu vào bảng User trước
INSERT INTO User (UserName, Email, Password, RoleID)
VALUES ('user1', 'user1@example.com', 'password1', 1);

-- Thêm dữ liệu vào bảng Hostel và Room
INSERT INTO Hostel (Name, Address, Phone, UserID)
VALUES ('Hostel A', '123 ABC Street', '123456789', 1);

INSERT INTO Room (Name, Description, Price, HostelID)
VALUES ('Single Room', 'A cozy room with a single bed', 50.00, 2);

-- Thêm dữ liệu vào bảng User
INSERT INTO User (UserName, Email, Password, RoleID)
VALUES ('Nguyễn Văn A', 'nguyenvana@example.com', 'password123', 1);

INSERT INTO User (UserName, Email, Password, RoleID)
VALUES ('Trần Thị B', 'tranthib@example.com', 'securepass', 2);

INSERT INTO User (UserName, Email, Password, RoleID)
VALUES ('Lê Thanh C', 'lethanhc@example.com', 'mysecretpw', 1);

INSERT INTO User (UserName, Email, Password, RoleID)
VALUES ('Phạm Hải D', 'phamhaid@example.com', 'hiddenpass', 2);

INSERT INTO User (UserName, Email, Password, RoleID)
VALUES ('Đặng Hoàng E', 'danghoange@example.com', 'classified', 1);


