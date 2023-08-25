USE guest_house ;

CREATE TABLE Role -- bảng chứa thông tin của 3 user. 
(
	RoleID int AUTO_INCREMENT PRIMARY KEY,
    RoleName NVARCHAR(250) NOT NULL
);

CREATE TABLE User
(
	UserID int AUTO_INCREMENT PRIMARY KEY,
    UserName NVARCHAR(50) NOT NULL,   
    Email VARCHAR(300),
    Password VARCHAR(1000) NOT NULL,      
    Avatar NVARCHAR(1000), 
    -- Có liên kết khóa ngoại giữa bảng "User" và bảng "Role":
    RoleID int NOT NULL, -- người thuê trọ, chủ nhà trọ, quản trị viên
        
    FOREIGN KEY (RoleID) REFERENCES Role(RoleID) -- liên kết user với vai trò tương ứng trong bảng "Role".    
);



CREATE TABLE Hostel
(
	HostelID int AUTO_INCREMENT PRIMARY KEY,
    Name NVARCHAR(250) NOT NULL,
    Address VARCHAR(1000) NOT NULL,
    Phone VARCHAR(50) NOT NULL,
    --  cột tham chiếu trong bảng "Hostel" để trỏ đến cột "UserID" trong bảng "User":
    UserID int NOT NULL,

    FOREIGN KEY (UserID) REFERENCES User(UserID)
);


CREATE TABLE Room
(
	RoomID int AUTO_INCREMENT PRIMARY KEY,
    Name NVARCHAR(250) NOT NULL,
	Description NVARCHAR(1000),
    Price float NOT NULL,    
    HostelID int NOT NULL,

    FOREIGN KEY (HostelID) REFERENCES Hostel(HostelID)
);


CREATE TABLE Posting
(
	PostingID int AUTO_INCREMENT PRIMARY KEY,
	Title NVARCHAR(250) NOT NULL,
    Description NVARCHAR(1000), -- nội dung
    CreatedDate DATETIME NOT NULL,
	UserID int NOT NULL,

	FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Image
(
	ImageID int AUTO_INCREMENT PRIMARY KEY,
	ImageLinking NVARCHAR(1000),
	PostingID int NOT NULL,
   
	FOREIGN KEY (PostingID) REFERENCES Posting(PostingID)
);

CREATE TABLE Comment
(
	CommentID int AUTO_INCREMENT PRIMARY KEY,
    Description NVARCHAR(1000), -- nội dung
	CreatedDate DATETIME NOT NULL, #ngày cmt
    UserID int NOT NULL,
   	PostingID int NOT NULL,

	FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (PostingID) REFERENCES Posting(PostingID)
);

CREATE TABLE Rating
(
	RatingID int AUTO_INCREMENT PRIMARY KEY,
    Point FLOAT NOT NULL,
	CreatedDate DATETIME NOT NULL, -- ngày cmt
	UserID int NOT NULL,
    HostelID int NOT NULL,

	FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (HostelID) REFERENCES Hostel(HostelID)
);


CREATE TABLE Follow
(
    FollowID int AUTO_INCREMENT PRIMARY KEY,
    FollowerUserID int,
    FollowedUserID int,
    
	-- phân biệt giữa người theo dõi và người được theo dõi:
    FOREIGN KEY (FollowerUserID) REFERENCES User(UserID),
    FOREIGN KEY (FollowedUserID) REFERENCES User(UserID)
);

Create table  Notification
(
	NotificationID int AUTO_INCREMENT Primary Key,	
	Content NVARCHAR(1000), -- Nội dung thông báo
	CreatedDate DATETIME, -- Ngày và giờ tạo thông báo
	IsRead BOOLEAN, -- Xác định thông báo đã được đoc hay chưa
    FollowID int NOT NULL, -- Liên kết với bảng "Follow" để xác định người theo dõi
    PostingID int NOT NULL,

	FOREIGN KEY (FollowID) REFERENCES Follow(FollowID),
	FOREIGN KEY (PostingID) REFERENCES Posting(PostingID)
);



